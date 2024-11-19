package Remotes;

import Devices.Device;
import Devices.SmartTV;

public class SmartRemote extends AdvancedRemote {

    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("SmartRemote: Executing voice command: " + command);
        if (device instanceof SmartTV) {
            SmartTV smartTV = (SmartTV) device;
            if (command.equalsIgnoreCase("browse internet")) {
                smartTV.browseInternet();
            } else {
                System.out.println("SmartRemote: Unknown voice command.");
            }
        } else {
            System.out.println("SmartRemote: This feature is only available on SmartTV.");
        }
    }
}