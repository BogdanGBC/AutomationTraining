package ObjectData;

import java.util.HashMap;

public class FrameObject {
    private String singleIFrame;
    private String multipleIFrame;
    public FrameObject(HashMap<String,String> testData) {

    }
    public void populateData(HashMap<String,String> tesData){
        for(String key:tesData.keySet()){
            switch (key){
                case "singleIFrame":
                    setSingleIFrame(tesData.get(key));
                    break;
                case "multipleIFrame":
                    setMultipleIFrame(tesData.get(key));
                    break;
            }
        }
    }

    public String getSingleIFrame() {
        return singleIFrame;
    }

    public void setSingleIFrame(String singleIFrame) {
        this.singleIFrame = singleIFrame;
    }

    public String getMultipleIFrame() {
        return multipleIFrame;
    }

    public void setMultipleIFrame(String multipleIFrame) {
        this.multipleIFrame = multipleIFrame;
    }
}
