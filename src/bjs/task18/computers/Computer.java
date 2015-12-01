package bjs.task18.computers;

/**
 * Created by YM on 26.11.2015.
 * Base class for other computer types
 */
public abstract class Computer {
    /**Unique identifier of the computer.*/
    private String article;
    /**The type of the computer. E.g. "PC", "Notebook", etc.*/
    private String computerDescription;

    /**CPU*/
    private Processor processor;
    /**RAM*/
    private RandomAccessMemory randomAccessMemory;
    /**Fixed memory. HDD, flash, etc.*/
    private Storage storage;

    /**
     * Presents information about CPU
     */
    protected class Processor {
        /**The type of the CPU. E.g. "Intel", "ARM", etc.*/
        private String type;
        /**The CPU clock rate in GHz*/
        private double clockRate;
        /**Cache size, Mb*/
        private double cacheSize;

        protected double getCacheSize() {
            return cacheSize;
        }

        protected void setCacheSize(double cacheSize) {
            this.cacheSize = cacheSize;
        }

        protected String getType() {
            return type;
        }

        protected void setType(String type) {
            this.type = type;
        }

        protected double getClockRate() {
            return clockRate;
        }

        protected void setClockRate(double clockRate) {
            this.clockRate = clockRate;
        }

        @Override
        public String toString() {
            String result = "Processor: ";
            result += getType() + ", ";
            result += getClockRate() + " GHz, ";
            result += getCacheSize() + " Mb\n";

            return result;
        }
   }

    /**
     * Presents information about RAM
     */
    protected class RandomAccessMemory {
        /**Random access memory type*/
        private String type;
        /**Random access memory size in Gb*/
        private double size;

        protected String getType() {
            return type;
        }

        protected void setType(String type) {
            this.type = type;
        }

        protected double getSize() {
            return size;
        }

        protected void setSize(double size) {
            this.size = size;
        }

        @Override
        public String toString() {
            String result = "RAM: ";
            result += getSize() + " Gb, ";
            result += getType() + "\n";

            return result;
        }
    }

    /**
     * Presents information about fixed memory.
     */
    protected class Storage {
        /**Storage type*/
        private String type;
        /**Storage size, Gb*/
        private double size;
        /**Speed. Gb/s, rpm, etc.*/
        private String speed;

        protected String getType() {
            return type;
        }

        protected void setType(String type) {
            this.type = type;
        }

        protected double getSize() {
            return size;
        }

        protected void setSize(double size) {
            this.size = size;
        }

        protected String getSpeed() {
            return speed;
        }

        protected void setSpeed(String speed) {
            this.speed = speed;
        }

        @Override
        public String toString() {
            String result = getType() + ", ";
            result += getSize() + " Gb, ";
            result += getSpeed() + "\n";

            return result;
        }
    }

    /**Constructor of the base class*/
    Computer() {
        processor = new Processor();
        randomAccessMemory = new RandomAccessMemory();
        storage = new Storage();
    }

    @Override
    public String toString() {
        String result = "Article: " + getArticle() + "\n";
        result += "Description: " + getComputerDescription() + "\n";
        result += getProcessor().toString();
        result += getRandomAccessMemory().toString();
        result += getStorage().toString();

        return result;
    }

    /**Gets processor object*/
    public Processor getProcessor() {
        return processor;
    }

    /**
     * Sets processor fields
     * @param type Processor type
     * @param clockRate Clock rate, GHh
     * @param cacheSize Processor cache size, Mb
     */
    public void setProcessor(String type, double clockRate, double cacheSize) {
        this.processor.setType(type);
        this.processor.setClockRate(clockRate);
        this.processor.setCacheSize(cacheSize);
    }

    /**Gets RAM object*/
    public RandomAccessMemory getRandomAccessMemory() {
        return randomAccessMemory;
    }

    /**
     * Sets RAM
     * @param type Type of the RAM
     * @param size Size of the RAM, Gb
     */
    public void setRandomAccessMemory(String type, double size) {
        this.randomAccessMemory.setType(type);
        this.randomAccessMemory.setSize(size);
    }

    /**
     * @return Computer type
     */
    public String getComputerDescription() {
        return computerDescription;
    }

    /**
     * Sets computer type
     * @param computerDescription The type of the computer.
     */
    public void setComputerDescription(String computerDescription) {
        this.computerDescription = computerDescription;
    }

    /**
     * Gets storage information
     * @return Storage object
     */
    public Storage getStorage() {
        return storage;
    }

    /**
     * Sets storage information
     * @param type Storage type
     * @param size Storage size, Gb
     * @param speed Storage speed
     */
    public void setStorage(String type, double size, String speed) {
        this.storage.setType(type);
        this.storage.setSize(size);
        this.storage.setSpeed(speed);
    }

    /**
     * Gets unique article of the computer
     * @return
     */
    public String getArticle() {
        return article;
    }

    /**
     * Sets unique article of the computer
     * @param article
     */
    public void setArticle(String article) {
        this.article = article;
    }
}
