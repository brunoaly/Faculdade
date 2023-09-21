import app = require("teem");

class IndexRoute {
	public async index(req: app.Request, res: app.Response) {
		res.render("index/index");
	}

	public async teste(req: app.Request, res: app.Response) {
		res.send("Eu sou um texto...");
	}

	public async listar(req: app.Request, res: app.Response) {
		let lista: any[];

		await app.sql.connect(async (sql) => {

			let query = "select id, nome, email from pessoa";
			let parametros: any[] = [];
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

export = IndexRoute;
