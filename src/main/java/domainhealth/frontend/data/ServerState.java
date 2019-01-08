package domainhealth.frontend.data;

/**
 * Created by chiovcr on 04/12/2014.
 */
public enum ServerState {

    //SHUTDOWD(0),
	SHUTDOW(0),
    STARTING(1),
    STANDBY(2),
    RESUMING(3),
    RUNNING(4),
    SUSPENDING(5),
    SHUTTING_DOWN(6),
    FAILED(7),
    UNKNKOWN(8);

    private int value;

    private ServerState(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static int getValueForState(String state) {
        for (ServerState type: values()) {
            if (type.toString().equals(state)) {
                return type.value;
            }
        }
        return -1;
    }
}
