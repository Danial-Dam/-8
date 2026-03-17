class SortingDecorator extends ReportDecorator {
    public SortingDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return super.generate() + "\n[Sorted Data]";
    }
}