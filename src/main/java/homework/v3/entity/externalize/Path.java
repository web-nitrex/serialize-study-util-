package homework.v3.entity.externalize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Path  implements Externalizable {
    
    public static final long SerialVersionUID = 1L;
    
    private String code;
    private String value;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException
    {
        out.writeObject(this.getCode());
        out.writeObject(this.getValue());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.setCode((String)in.readObject());
        this.setValue((String)in.readObject());
    }
}
