var company = new Object();
company.name = "Big Hiccups Suluções";
company.ceo = new Object();
company.ceo.firstName = "Bruno";
company.ceo.personalSite = "https://m4ns0.github.io/";

console.log(company);
console.log("Company Name: " + company.name + "\n" +
    "Company CEO name: " + company.ceo.firstName + "\n" +
    "CEO Personal site: " + company.ceo.personalSite);

console.log(company["name"]);

company["Stock of Company"] = 110;
console.log("Stock price is " + company["Stock of Company"]);

var StockPropName = "Stock of Company";
company[StockPropName] = 110;
console.log("Stock price is " + company["Stock of Company"]);