package SOAP;

interface ServiceRequester {

    ServiceProvider bind(ServiceProvider provider);

    ServiceRegistry find(ServiceRegistry registry);
}