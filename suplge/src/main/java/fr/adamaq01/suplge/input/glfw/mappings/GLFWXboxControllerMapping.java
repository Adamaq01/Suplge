package fr.adamaq01.suplge.input.glfw.mappings;

import fr.adamaq01.suplge.api.input.controllers.IController;
import fr.adamaq01.suplge.api.input.controllers.IControllerMapping;

/**
 * Created by Adamaq01 on 18/03/2017.
 */
public class GLFWXboxControllerMapping implements IControllerMapping {

    @Override
    public int getRealIdByButton(IController.Button button) {
        switch (button.getInputKeyId()) {
            case 12:
                return 0;
            case 9:
                return 1;
            case 10:
                return 2;
            case 11:
                return 3;
            case 1:
                return 4;
            case 3:
                return 5;
            case 15:
                return 6;
            case 16:
                return 7;
            case 13:
                return 8;
            case 14:
                return 9;
            case 7:
                return 10;
            case 6:
                return 11;
            case 8:
                return 12;
            case 5:
                return 13;
            default:
                return -1;
        }
    }
}
