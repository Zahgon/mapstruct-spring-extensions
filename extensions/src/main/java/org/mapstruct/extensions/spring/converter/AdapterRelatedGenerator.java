package org.mapstruct.extensions.spring.converter;

import com.squareup.javapoet.TypeSpec;
import java.io.Writer;
import java.time.Clock;

public abstract class AdapterRelatedGenerator extends Generator {

    protected AdapterRelatedGenerator(Clock clock) {
        super(clock);
    }

    public final void writeGeneratedCodeToOutput(final ConversionServiceAdapterDescriptor descriptor, final Writer out) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected abstract TypeSpec createMainTypeSpec(ConversionServiceAdapterDescriptor descriptor);
}
