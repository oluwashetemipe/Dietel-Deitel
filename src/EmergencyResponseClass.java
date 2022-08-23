public class EmergencyResponseClass {
    private enum DepartmentNeeded{FIRE, AMBULANCE,POLICE}
    private int callerId;
    private String phoneNumber;
    private int currentSizeOfPeople;
    private String callerName;
    private String callerCurrentLocation;
    private String callerCurrentSituation;
    private DepartmentNeeded departmentNeeded;
    private String callReason;
    private String actionTaken;
    private String actionStatus;
    private String comments;

    public DepartmentNeeded getDepartmentNeeded() {
        return departmentNeeded;
    }

    public void setDepartmentNeeded(DepartmentNeeded departmentNeeded) {
        this.departmentNeeded = departmentNeeded;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCurrentSizeOfPeople() {
        return currentSizeOfPeople;
    }

    public void setCurrentSizeOfPeople(int currentSizeOfPeople) {
        this.currentSizeOfPeople = currentSizeOfPeople;
    }

    public int getCallerId() {
        return callerId;
    }

    public void setCallerId(int callerId) {
        this.callerId = callerId;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public String getCallerCurrentLocation() {
        return callerCurrentLocation;
    }

    public void setCallerCurrentLocation(String callerCurrentLocation) {
        this.callerCurrentLocation = callerCurrentLocation;
    }

    public String getCallerCurrentSituation() {
        return callerCurrentSituation;
    }

    public void setCallerCurrentSituation(String callerCurrentSituation) {
        this.callerCurrentSituation = callerCurrentSituation;
    }

    public String getCallReason() {
        return callReason;
    }

    public void setCallReason(String callReason) {
        this.callReason = callReason;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public String getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}

