class DateFilterDecorator extends ReportDecorator {
    public DateFilterDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return super.generate() + "\n[Filtered by Date]";
    }
}