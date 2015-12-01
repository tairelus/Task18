package bjs.task18;

import bjs.task18.computers.Desktop;
import bjs.task18.computerstore.ComputerStore;

public class Main {
    public static void main(String[] args) {
        ComputerStore computerStore = new ComputerStore();

        Desktop computer = new Desktop();
        computer.setArticle("DT-bf47c40e");
        computer.setComputerDescription("Base game PC");
        computer.setProcessor("Intel Core i3-6100", 3.7, 3);
        computer.setRandomAccessMemory("DDR3-1600", 8);
        computer.setStorage("HDD", 1000, "7200 rpm");
        computer.setMotherboard("Intel H110/B150 (LGA1151)");
        computer.setVideoCard("NVIDIA GeForce GTX 750 Ti", 2, "GDDR5");
        computer.setDisplay("23″, IPS matrix, DVI/HDMI");
        computer.setChassis("Middle Tower ATX, 450 W");
        computer.setAudioCard("Realtek HD Audio");
        //Accessories
        computer.setKeyboard("Logitech G410 Atlas Spectrum");
        computer.setMouse("Lenovo Y Gaming Precision Mouse");
        computer.setWebcam("Logitech HD Webcam C270");
        computer.setHeadset("Lenovo Y Gaming Surround Sound Headset");
        computer.setAudioSystem("Logitech Speaker System Z320 ");
        computer.setPrice(710);

        computerStore.addDesktop(computer);

        computer = new Desktop();
        computer.setArticle("DT-3cbdc19b");
        computer.setComputerDescription("Optimal game PC");
        computer.setProcessor("Intel Core i5-6500", 3.6, 6);
        computer.setRandomAccessMemory("DDR3-1866", 8);
        computer.setStorage("HDD", 2000, "7200 rpm");
        computer.setMotherboard("Intel B150/H170 (LGA1151)");
        computer.setVideoCard("AMD Radeon R9 380", 2, "GDDR5");
        computer.setDisplay("23″, матрица IPS/e-IPS/PLS, DVI");
        computer.setChassis("Middle Tower ATX, 500 W");
        computer.setAudioCard("Realtek HD Audio");
        //Accessories
        computer.setKeyboard("Logitech G410 Atlas Spectrum");
        computer.setMouse("Lenovo Y Gaming Precision Mouse");
        computer.setWebcam("Logitech HD Webcam C310");
        computer.setHeadset("Lenovo Y Gaming Surround Sound Headset");
        computer.setAudioSystem("Logitech Speaker System Z320 ");
        computer.setPrice(1110);

        computerStore.addDesktop(computer);

        computer = new Desktop();
        computer.setArticle("DT-93fee7a1");
        computer.setComputerDescription("Advanced game PC");
        computer.setProcessor("Intel Core i5-6600K", 3.9, 6);
        computer.setRandomAccessMemory("DDR3-2133", 16);
        computer.setStorage("HDD", 2000, "7200 rpm");
        computer.setMotherboard("Intel Z170 (LGA1151)");
        computer.setVideoCard("NVIDIA GeForce GTX 970", 4, "GDDR5");
        computer.setDisplay("23-27″, матрица IPS/PLS, DVI/HDMI/DisplayPort");
        computer.setChassis("Middle Tower ATX, 650 W");
        computer.setAudioCard("Realtek HD Audio");
        //Accessories
        computer.setKeyboard("Logitech G410 Atlas Spectrum");
        computer.setMouse("Lenovo Y Gaming Precision Mouse");
        computer.setWebcam("Logitech HD Webcam C930e");
        computer.setHeadset("Lenovo Y Gaming Surround Sound Headset");
        computer.setAudioSystem("Logitech Speaker System Z320 ");
        computer.setPrice(1695);

        computerStore.addDesktop(computer);

        computerStore.printDesktopComputersForEach();
    }
}

/*
Article: DT-bf47c40e
Description: Base game PC
Processor: Intel Core i3-6100, 3.7 GHz, 3.0 Mb
RAM: 8.0 Gb, DDR3-1600
HDD, 1000.0 Gb, 7200 rpm
NVIDIA GeForce GTX 750 Ti, 2.0 Gb, GDDR5
Display: 23″, IPS matrix, DVI/HDMI
Chassis: Middle Tower ATX, 450 W
Audio card: Realtek HD Audio
Accessories:
	Lenovo Y Gaming Surround Sound Headset
	Lenovo Y Gaming Precision Mouse
	Logitech Speaker System Z320
	Logitech G410 Atlas Spectrum
	Logitech HD Webcam C270

Price:  710.0
--------------------------------------------

Article: DT-93fee7a1
Description: Advanced game PC
Processor: Intel Core i5-6600K, 3.9 GHz, 6.0 Mb
RAM: 16.0 Gb, DDR3-2133
HDD, 2000.0 Gb, 7200 rpm
NVIDIA GeForce GTX 970, 4.0 Gb, GDDR5
Display: 23-27″, матрица IPS/PLS, DVI/HDMI/DisplayPort
Chassis: Middle Tower ATX, 650 W
Audio card: Realtek HD Audio
Accessories:
	Lenovo Y Gaming Surround Sound Headset
	Lenovo Y Gaming Precision Mouse
	Logitech Speaker System Z320
	Logitech G410 Atlas Spectrum
	Logitech HD Webcam C930e

Price:  1695.0
--------------------------------------------

Article: DT-3cbdc19b
Description: Optimal game PC
Processor: Intel Core i5-6500, 3.6 GHz, 6.0 Mb
RAM: 8.0 Gb, DDR3-1866
HDD, 2000.0 Gb, 7200 rpm
AMD Radeon R9 380, 2.0 Gb, GDDR5
Display: 23″, матрица IPS/e-IPS/PLS, DVI
Chassis: Middle Tower ATX, 500 W
Audio card: Realtek HD Audio
Accessories:
	Lenovo Y Gaming Surround Sound Headset
	Lenovo Y Gaming Precision Mouse
	Logitech Speaker System Z320
	Logitech G410 Atlas Spectrum
	Logitech HD Webcam C310

Price:  1110.0
--------------------------------------------
 */
