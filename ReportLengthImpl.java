public class ReportLengthImpl implements ReportLength{


    public  boolean  isTooLong(String reportName){

        if(reportName.length() > ReportLength.MAX_LENGTH){
            return true;
        }
        return false;

    }
    public  boolean  isViolation(){

        return true;
    }
}
