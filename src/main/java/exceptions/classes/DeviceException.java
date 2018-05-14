package exceptions.classes;

import exceptions.types.DeviceExceptionType;

/**
 * Created by aldom on 09.10.2017.
 */
public class DeviceException extends GeneralException {
    public DeviceException(DeviceExceptionType type, String description, Throwable cause) {
        super(type, description, cause);
    }
}
