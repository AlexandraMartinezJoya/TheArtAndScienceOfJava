package SOAP;

 interface ServiceRegistry {

    ServiceRegistry register(ServiceRequester requester);

    ServiceProvider register(ServiceProvider provider);
}
