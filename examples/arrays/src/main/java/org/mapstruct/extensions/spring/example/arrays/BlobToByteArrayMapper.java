package org.mapstruct.extensions.spring.example.arrays;

import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

@Mapper(config = SpringMapperConfig.class)
public interface BlobToByteArrayMapper extends Converter<Blob, byte[]> {

    @Override
    default byte[] convert(Blob blob) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
