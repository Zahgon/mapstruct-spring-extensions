package org.mapstruct.extensions.spring.converter;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;
import static org.mapstruct.extensions.spring.SpringMapperConfig.DEFAULT_CONFIGURATION_CLASS_NAME;
import static org.mapstruct.extensions.spring.SpringMapperConfig.DEFAULT_CONVERSION_SERVICE_BEAN_NAME;
import com.squareup.javapoet.ClassName;
import java.util.List;

public class ConversionServiceAdapterDescriptor {

    public static final String DEFAULT_CONVERTER_SCAN_CLASS_NAME = "ConverterScan";

    public static final String DEFAULT_CONVERTER_SCANS_CLASS_NAME = "ConverterScans";

    private ClassName adapterClassName;

    private String conversionServiceBeanName = DEFAULT_CONVERSION_SERVICE_BEAN_NAME;

    private List<FromToMapping> fromToMappings;

    private boolean lazyAnnotatedConversionServiceBean;

    private String configurationClassName = DEFAULT_CONFIGURATION_CLASS_NAME;

    private boolean generateConverterScan;

    boolean hasNonDefaultConversionServiceBeanName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ClassName getAdapterClassName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ConversionServiceAdapterDescriptor adapterClassName(final ClassName adapterClassName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getConversionServiceBeanName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ConversionServiceAdapterDescriptor conversionServiceBeanName(final String conversionServiceBeanName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<FromToMapping> getFromToMappings() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ConversionServiceAdapterDescriptor fromToMappings(final List<FromToMapping> fromToMappings) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isLazyAnnotatedConversionServiceBean() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ConversionServiceAdapterDescriptor lazyAnnotatedConversionServiceBean(final boolean lazyAnnotatedConversionServiceBean) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ConversionServiceAdapterDescriptor configurationClassName(final String configurationClassName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getConfigurationClassName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isGenerateConverterScan() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ConversionServiceAdapterDescriptor generateConverterScan(final boolean generateConverterScan) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ClassName getConverterScanClassName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ClassName getConverterScansClassName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ClassName getConverterRegistrationConfigurationClassName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
