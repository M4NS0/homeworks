/*
function orderChickenWith(sideDish) {
    console.log("Chicken with " + sideDish);
}
orderChickenWith("noodles");
*/

/*
function orderChickenWith(sideDish) {
    if (sideDish === undefined) {
        sideDish = "whatever!";
    }
    console.log("Chicken with " + sideDish);
}
orderChickenWith("noodles");
orderChickenWith();
*/
function orderChickenWith(sideDish) {
    sideDish = sideDish || "whatever!!";
    console.log("Chicken with " + sideDish);
}
orderChickenWith("noodles");
orderChickenWith();