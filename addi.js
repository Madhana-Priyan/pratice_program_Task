const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter the First Number: ", (first) => {
    rl.question("Enter the Second Number: ", (second) => {

        let a = parseFloat(first);
        let b = parseFloat(second);

        a += b;

        console.log("Addition of Two Numbers is " + a);

        rl.close();
    });
});