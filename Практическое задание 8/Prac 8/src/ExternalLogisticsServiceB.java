class ExternalLogisticsServiceB {
    public void sendPackage(String info) {
        System.out.println("ServiceB sending: " + info);
    }

    public String checkPackageStatus(String code) {
        return "ServiceB status for " + code;
    }
}