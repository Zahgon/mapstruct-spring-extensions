package org.mapstruct.extensions.spring.converter;

import static javax.lang.model.element.Modifier.ABSTRACT;
import static javax.lang.model.element.Modifier.PUBLIC;
import com.squareup.javapoet.ArrayTypeName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.time.Clock;
import java.util.Optional;

public class ConverterScansGenerator extends AdapterRelatedGenerator {

    public ConverterScansGenerator(final Clock clock) {
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
}
