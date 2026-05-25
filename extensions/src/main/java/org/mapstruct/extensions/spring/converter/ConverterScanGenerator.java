package org.mapstruct.extensions.spring.converter;

import static com.squareup.javapoet.WildcardTypeName.subtypeOf;
import static javax.lang.model.element.Modifier.ABSTRACT;
import static javax.lang.model.element.Modifier.PUBLIC;
import com.squareup.javapoet.*;
import java.lang.annotation.*;
import java.time.Clock;
import java.util.Optional;

public class ConverterScanGenerator extends AdapterRelatedGenerator {

    private static final ClassName COMPONENT_SCAN_CLASS_NAME = ClassName.get(SPRING_CONTEXT_ANNOTATION_PACKAGE_NAME, "ComponentScan");

    private static final ClassName IMPORT_CLASS_NAME = ClassName.get(SPRING_CONTEXT_ANNOTATION_PACKAGE_NAME, "Import");

    private static final AnnotationSpec REPEATABLE_ANNOTATION_SPEC = AnnotationSpec.builder(Repeatable.class).addMember("value", "$L", "ConverterScans.class").build();

    private static final ClassName BEAN_NAME_GENERATOR_CLASS_NAME = ClassName.get("org.springframework.beans.factory.support", "BeanNameGenerator");

    public ConverterScanGenerator(final Clock clock) {
        super(clock);
    }

    @Override
    protected JavaFile.Builder modifyDefaultFileBuilder(final JavaFile.Builder javaFileBuilder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected TypeSpec createMainTypeSpec(final ConversionServiceAdapterDescriptor descriptor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static MethodSpec aliasMethodSpec(final String attributeName, final TypeName returnType, final CodeBlock defaultValue) {
        return MethodSpec.methodBuilder(attributeName).addAnnotation(aliasAnnotationSpec(attributeName)).addModifiers(PUBLIC, ABSTRACT).returns(returnType).defaultValue(defaultValue).build();
    }

    private static MethodSpec aliasArrayMethodSpec(final String attributeName, final TypeName componentType) {
        return aliasMethodSpec(attributeName, ArrayTypeName.of(componentType), CodeBlock.builder().add("$L", "{}").build());
    }

    private static AnnotationSpec aliasAnnotationSpec(final String attributeName) {
        return AnnotationSpec.builder(ClassName.get("org.springframework.core.annotation", "AliasFor")).addMember("annotation", "$T.class", COMPONENT_SCAN_CLASS_NAME).addMember("attribute", "$S", attributeName).build();
    }
}
