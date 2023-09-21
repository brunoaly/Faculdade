"use strict";
const app = require("teem");
class IndexRoute {
    async index(req, res) {
        res.render("index/index");
    }
    async teste(req, res) {
        res.send("Eu sou um texto...");
    }
    async listar(req, res) {
        let lista;
        await app.sql.connect(async (sql) => {
            let query = "select id, nome, email from pessoa";
            let parametros = [];
            let where = false;
            let nome = req.query.nome;
            if (nome) {
                if (where)
                    query += " and nome = ?";
                else
                    query += " where nome = ?";
                parametros.push(nome);
                where = true;
            }
            let email = req.query.email;
            if (email) {
                if (where)
                    query += " and email = ?";
                else
                    query += " where email = ?";
                parametros.push(email);
                where = true;
            }
            lista = await sql.query(query, parametros);
        });
        res.json(lista);
    }
}
module.exports = IndexRoute;
//# sourceMappingURL=index.js.map