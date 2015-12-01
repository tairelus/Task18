package bjs.task18.computers;

import java.util.HashMap;

/**
 * Created by YM on 26.11.2015.
 * Class Computer presents a desktop computer
 */

public class Desktop extends Computer implements Accessories{
	/**Describes motherboard type and model*/
	private String motherboard;
	/**Describes video card*/
	private VideoCard videoCard;
	/**Display description*/
	private String display;
	/**Chassis and power supply*/
	private String chassis;
	/**Audio card*/
	private String audioCard;
	/**Price*/
	private double price;

	/**Computer accessories. Implemented as HashMap to provide random access to each element*/
	protected HashMap<String, String> accessories;

	/**
	 * Presents information about video card
	 */
	protected class VideoCard {
		/**Card type*/
		private String type;
		/**RAM size, Mb*/
		private double ramSize;
		/**RAM type*/
		private String ramType;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public double getRamSize() {
			return ramSize;
		}

		public void setRamSize(double ramSize) {
			this.ramSize = ramSize;
		}

		public String getRamType() {
			return ramType;
		}

		public void setRamType(String ramType) {
			this.ramType = ramType;
		}

		@Override
		public String toString() {
			String result = getType() + ", ";
			result += getRamSize() + " Gb, ";
			result += getRamType() + "\n";

			return result;
		}
	}

	public Desktop() {
		videoCard = new VideoCard();
		accessories = new HashMap<String, String>();
	}

    @Override
    public String toString() {
        String result = super.toString();
		result += videoCard.toString();
		result += "Display: " + display + "\n";
		result += "Chassis: " + chassis + "\n";
		result += "Audio card: " + audioCard + "\n";
		result += "Accessories: " + getAccessories() + "\n";
		result += "Price:  " + price + "\n";

        return result;
    }

	/**Sets motherboard type*/
	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	/**
	 * Sets video card
	 * @param type Card name
	 * @param ramSize Card RAM size
	 * @param ramType Card RAM type
     */
	public void setVideoCard(String type, double ramSize, String ramType) {
		this.videoCard.setType(type);
		this.videoCard.setRamSize(ramSize);
		this.videoCard.setRamType(ramType);
	}

	/**
	 * Sets display
	 * @param display Display name and type
     */
	public void setDisplay(String display) {
		this.display = display;
	}

	/**
	 * Sets chassis and power supply
	 * @param chassis Chassis and power supply
     */
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	/**
	 * Sets type of the audio card
	 * @param audioCard Type of the audio card
     */
	public void setAudioCard(String audioCard) {
		this.audioCard = audioCard;
	}

	/**
	 * Sets price
	 * @param price Price
     */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Sets the keyboard
	 * @param keyboard
     */
	public void setKeyboard(String keyboard) {
		accessories.put(KEYBOARD, keyboard);
	}

	/**
	 * Sets the mouse
	 * @param mouse
     */
	public void setMouse(String mouse) {
		accessories.put(MOUSE, mouse);
	}

	/**
	 * Sets the web camera
	 * @param webcam
     */
	public void setWebcam(String webcam) {
		accessories.put(WEBCAM, webcam);
	}

	/**
	 * Sets the headset
	 * @param headset
     */
	public void setHeadset(String headset) {
		accessories.put(HEADSET, headset);
	}

	/**
	 * Sets the audio system
	 * @param audioSystem
	 */
	public void setAudioSystem(String audioSystem) {
		accessories.put(AUDIOSYSTEM, audioSystem);
	}

	/**
	 * Returns all accessories as string
	 * @return
     */
	public String getAccessories() {
		String result = "\n";

		for (HashMap.Entry<String, String> entry : accessories.entrySet()) {
			result += "\t" + entry.getValue() + "\n";
		}

		return result;
	}
}
