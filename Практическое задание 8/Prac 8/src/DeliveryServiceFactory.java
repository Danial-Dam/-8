class DeliveryServiceFactory {
    public static IInternalDeliveryService getService(String type) {
        switch (type) {
            case "internal":
                return new InternalDeliveryService();
            case "A":
                return new LogisticsAdapterA();
            case "B":
                return new LogisticsAdapterB();
            case "C":
                return new LogisticsAdapterC();
            default:
                throw new IllegalArgumentException("Unknown service type");
        }
    }
}