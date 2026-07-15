const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter range number: ", (range) => {
    const n = (range);
    let sum = 0;
    let count = 0;

    function getNumber() {
        if (count < n) {
            rl.question("Enter number: ", (num) => {
                sum +=(num);
                count++;
                getNumber();
            });
        } else {
            console.log("Calculated average is " + (sum / n));
            rl.close();
        }
    }

    getNumber();
});