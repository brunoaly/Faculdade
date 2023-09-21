"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const app = require("teem");
app.run({
    sqlConfig: {
        connectionLimit: 30,
        waitForConnections: true,
        charset: "utf8mb4",
        host: "localhost",
        port: 3306,
        user: "root",
        password: "root",
        database: "agenda"
    }
});
//# sourceMappingURL=app.js.map