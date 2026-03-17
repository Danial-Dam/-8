class AmountFilterDecorator extends ReportDecorator {
    public AmountFilterDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return super.generate() + "\n[Filtered by Amount > 150]";
    }
}