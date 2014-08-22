
package org.mule.modules.quickbooks.windows.schema.transformers;

import javax.annotation.Generated;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.modules.quickbooks.windows.schema.ObjectName;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-22T02:33:09-05:00", comments = "Build 3.4.3.1620.30ea288")
public class ObjectNameEnumTransformer
    extends AbstractTransformer
    implements DiscoverableTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;

    public ObjectNameEnumTransformer() {
        registerSourceType(DataTypeFactory.create(String.class));
        setReturnClass(ObjectName.class);
        setName("ObjectNameEnumTransformer");
    }

    protected Object doTransform(Object src, String encoding)
        throws TransformerException
    {
        ObjectName result = null;
        result = Enum.valueOf(ObjectName.class, ((String) src));
        return result;
    }

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

}
