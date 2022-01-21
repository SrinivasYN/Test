


public class ReportPalindromImpl implements ReportPalindrom {


    public boolean isViolation() {
        return false;
    }

    public boolean isPalin(String reportName) {

        StringBuffer sbObj = new StringBuffer(reportName);
        sbObj = sbObj.reverse();
        String stObj = sbObj.toString();

        if(stObj.equalsIgnoreCase(reportName)){
            return true;
        }
        return false;
    }
}
