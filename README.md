# Basic CRUD Biodata Siswa with PostgreSQL

* Siswa
* Jurusan

# Run project with gradle

```shell
gradle bootRun
```

# Cara Setup Database #

* Setup dengan Docker

```shell
docker run --rm \
	--name local-postgres \
	-e POSTGRES_DB=biodata \
	-e POSTGRES_USER=biodata \
	-e POSTGRES_PASSWORD=L4eYN28WaG7F5unfiKCm \
	-e PGDATA=/var/lib/postgresql/data/pgdata \
	-v "$PWD/datadb:/var/lib/postgresql/data" \
    -p 5432:5432 \
	postgres:15
```

# Versioning Migration using calver(callendar versioning)#
https://calver.org

# Create Migration in src/main/resources/db/migration
* using flyway format, Ex: V20221025_init

# Run Migration with gradle
```shell
gradle flywayMigrate
```
