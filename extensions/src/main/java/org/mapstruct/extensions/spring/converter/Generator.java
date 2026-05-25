package org.mapstruct.extensions.spring.converter;

import static java.lang.Boolean.parseBoolean;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.time.format.DateTimeFormatter.ISO_INSTANT;
import static javax.lang.model.SourceVersion.RELEASE_8;
import com.squareup.javapoet.*;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.time.Clock;
import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.annotation.processing.ProcessingEnvironment;

public abstract class Generator {

    protected static final String GENERATED_ANNOTATION_CLASS_NAME_STRING = "Generated";

    protected static final String PRE_JAVA_9_ANNOTATION_GENERATED_PACKAGE = "javax.annotation";

    protected static final String JAVA_9_PLUS_ANNOTATION_GENERATED_PACKAGE = "javax.annotation.processing";

    protected static final AnnotationSpec TARGET_TYPE_ANNOTATION_SPEC = AnnotationSpec.builder(Target.class).addMember("value", "$L", TYPE).build();

    protected static final AnnotationSpec RETENTION_RUNTIME_ANNOTATION_SPEC = AnnotationSpec.builder(Retention.class).addMember("value", "$L", RUNTIME).build();

    protected static final String SPRING_CONTEXT_ANNOTATION_PACKAGE_NAME = "org.springframework.context.annotation";

    protected static final ClassName CONVERTER_CLASSNAME = ClassName.get("org.springframework.core.convert.converter", "Converter");

    private static final String PRE_JAVA_9_ANNOTATION_GENERATED = String.format("%s.%s", PRE_JAVA_9_ANNOTATION_GENERATED_PACKAGE, GENERATED_ANNOTATION_CLASS_NAME_STRING);

    private static final String JAVA_9_PLUS_ANNOTATION_GENERATED = String.format("%s.%s", JAVA_9_PLUS_ANNOTATION_GENERATED_PACKAGE, GENERATED_ANNOTATION_CLASS_NAME_STRING);

    private static final ClassName PRE_JAVA_9_ANNOTATION_GENERATED_CLASS_NAME = ClassName.get(PRE_JAVA_9_ANNOTATION_GENERATED_PACKAGE, GENERATED_ANNOTATION_CLASS_NAME_STRING);

    private static final ClassName JAVA_9_PLUS_ANNOTATION_GENERATED_CLASS_NAME = ClassName.get(JAVA_9_PLUS_ANNOTATION_GENERATED_PACKAGE, GENERATED_ANNOTATION_CLASS_NAME_STRING);

    private static final String SUPPRESS_GENERATOR_TIMESTAMP = "mapstruct.suppressGeneratorTimestamp";

    private final Clock clock;

    private final AtomicReference<ProcessingEnvironment> processingEnvironment;

    protected Generator(final Clock clock) {
        this.clock = clock;
        processingEnvironment = new AtomicReference<>();
    }

    protected final ProcessingEnvironment getProcessingEnvironment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public final void init(final ProcessingEnvironment processingEnv) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final Clock getClock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final boolean isPreJava9GeneratedAvailable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final boolean isJava9PlusGeneratedAvailable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean isSourceVersionAtLeast9() {
        return getProcessingEnvironment().getSourceVersion().compareTo(RELEASE_8) > 0;
    }

    protected boolean isTypeAvailable(final String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final AnnotationSpec buildGeneratedAnnotationSpec() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private AnnotationSpec.Builder addDateIfNotSuppressed(final AnnotationSpec.Builder generatedAnnotationSpecBuilder) {
        return parseBoolean(getProcessingEnvironment().getOptions().get(SUPPRESS_GENERATOR_TIMESTAMP)) ? generatedAnnotationSpecBuilder : generatedAnnotationSpecBuilder.addMember("date", "$S", ISO_INSTANT.format(ZonedDateTime.now(getClock())));
    }

    private AnnotationSpec.Builder baseGeneratedAnnotationSpecBuilder() {
        final AnnotationSpec.Builder builder;
        if (isJava9PlusGeneratedAvailable()) {
            builder = AnnotationSpec.builder(JAVA_9_PLUS_ANNOTATION_GENERATED_CLASS_NAME);
        } else if (isPreJava9GeneratedAvailable()) {
            builder = AnnotationSpec.builder(PRE_JAVA_9_ANNOTATION_GENERATED_CLASS_NAME);
        } else {
            builder = null;
        }
        return builder;
    }

    protected JavaFile.Builder modifyDefaultFileBuilder(final JavaFile.Builder javaFileBuilder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final void writeGeneratedCodeToOutput(final Supplier<String> packageNameSupplier, final Supplier<TypeSpec> mainTypeSpecSupplier, final Writer out) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final boolean isCollectionWithGenericParameter(final ParameterizedTypeName parameterizedTypeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final String collectionOfNameIfApplicable(final TypeName typeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
