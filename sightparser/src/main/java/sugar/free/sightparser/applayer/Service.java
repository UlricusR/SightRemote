package sugar.free.sightparser.applayer;

import lombok.Getter;
import lombok.Setter;

public enum  Service {

    CONNECTION((byte) 0x00, (short) 0, null),
    STATUS((byte) 0x0F, (short) 0x0100, null),
    STATUSPARAM((byte) 0x33, (short) 0x0200, null),
    PUMP_DATA((byte) 0x3C, (short) 0x0200, null),
    CONFIGURATION((byte) 0x55, (short) 0x0200, "u+5Fhz6Gw4j1Kkas"),
    REMOTE_CONTROL((byte) 0x66, (short) 0x0100, null);

    @Getter
    private byte serviceID;
    @Getter
    private short version;
    @Setter
    @Getter
    private String servicePassword;

    Service(byte serviceID, short version, String servicePassword) {
        this.serviceID = serviceID;
        this.version = version;
        this.servicePassword = servicePassword;
    }

}
