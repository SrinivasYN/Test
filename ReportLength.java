public interface ReportLength {

    int MAX_LENGTH = 25;
    public  boolean  isTooLong(String reportName);
    public  boolean  isViolation();

}
