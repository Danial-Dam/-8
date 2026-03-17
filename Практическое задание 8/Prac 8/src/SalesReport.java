class SalesReport implements IReport {
    @Override
    public String generate() {
        return "Sales Report:\nDate:2026-01-01 Amount:100\nDate:2026-02-01 Amount:200";
    }
}

class UserReport implements IReport {
    @Override
    public String generate() {
        return "User Report:\nUser:Alice Age:25\nUser:Bob Age:30";
    }
}