public class Report {
    private String success_message ="Report generated successfully";
    private String failure_message ="Report not generated";

    ReportPalindrom palinObj = new ReportPalindromImpl();
    ReportLength lenobj = new ReportLengthImpl();

    public Report newReport(String reportName){



        palinObj.isPalin(reportName);
        lenobj.isTooLong(reportName);

    }
    public boolean isViolation(String reportName){

        palinObj.isViolation();
        lenobj.isViolation();


        if( palinObj.isPalin(reportName) && lenobj.isTooLong(reportName)){
            return true;
        }
        return false;

    }

}
