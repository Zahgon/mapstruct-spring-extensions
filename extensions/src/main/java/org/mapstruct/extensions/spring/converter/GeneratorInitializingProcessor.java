package org.mapstruct.extensions.spring.converter;

import com.squareup.javapoet.ClassName;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.SourceVersion;

public abstract class GeneratorInitializingProcessor extends AbstractProcessor {

    private final List<Generator> generators;

    protected GeneratorInitializingProcessor(final Generator... generators) {
        this.generators = List.of(generators);
    }

    @Override
    public synchronized void init(final ProcessingEnvironment processingEnv) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final SourceVersion getSupportedSourceVersion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final Writer openSourceFile(final Supplier<ClassName> classNameSupplier) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
