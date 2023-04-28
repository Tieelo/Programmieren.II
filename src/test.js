var devUrls = ["deala04373.zurich.uat:8443", "deala05300.zurich.uat:8443", "accounts-sit.ldc.uk.zurich.com"];
var uatUrls = ["ceala06147.zurich.uat:8443", "ceala06246.zurich.uat:8443", "accounts-uat.zurich.de"];
var proUrls = ["ceala06144.emea.zurich.corp:8443", "ceala06145.emea.zurich.corp:8443", "accounts.zurich.de"];

var environment = pm.collectionVariables.get("environment");
//var iterationsLeft = devUrls.length;

if(isEmpty(pm.collectionVariables.get("iterationsLeft"))){
    pm.collectionVariables.set("iterationsLeft", getNumberOfIterationsForEnvironment(environment));
}

var iterationsLeft = pm.collectionVariables.get("iterationsLeft");

pm.collectionVariables.set("apiGatewayBaseURL", getKeycloakUrlForEnvironment(environment, iterationsLeft));

function getNumberOfIterationsForEnvironment(){
    switch(environment.toLowerCase().substring(0, 3)){
        case "dev": return devUrls.length;
        case "uat": return uatUrls.length;
        case "pro": return proUrls.length;
        default: return undefined;
    }
}
function getKeycloakUrlForEnvironment(environment, iterationsLeft){
    switch(environment.toLowerCase().substring(0, 3)){
        case "dev": return devUrls[devUrls.length - iterationsLeft];
        case "uat": return uatUrls[uatUrls.length - iterationsLeft];
        case "pro": return proUrls[proUrls.length - iterationsLeft];
        default: return undefined;
    }
}

function getKeycloakRealmForEnvironment(environment){
    switch(environment.toLowerCase().substring(0, 3)){
        case "dev": return "dev-buza";
        case "uat": return "zde-uat";
        case "pro": return "zde"
        default: return undefined;
    }
}

function isEmpty(str) {
    return (!str || str.length === 0 );}
