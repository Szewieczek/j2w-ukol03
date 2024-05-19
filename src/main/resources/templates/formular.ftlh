[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>
<div class="form-container">
    <h1>Přidat novou vizitku</h1>
    <form action="/nova" method="post" class="d-flex flex-column align-items-start">
        <div class="container">
            <div class="row d-flex justify-content-center align-items-center">
                <div class="col-md-6">
                    <form action="/nova" method="post" class="d-flex flex-column align-items-start">
                        <div class="form-group mb-3">
                            <label for="jmeno" class="form-label text-right pr-3">Jméno</label>
                            <input type="text" class="form-control flex-grow-1" id="jmeno" name="jmeno" required>
                        </div>
                        <div class="form-group mb-3">
                            <label for="firma" class="form-label">Firma</label>
                            <input type="text" class="form-control" id="firma" name="firma" required>
                        </div>
                        <div class="form-group mb-3">
                            <label for="ulice" class="form-label">Ulice</label>
                            <input type="text" class="form-control" id="ulice" name="ulice" required>
                        </div>
                        <div class="form-group mb-3">
                            <label for="obecPsc" class="form-label">Obec a PSČ</label>
                            <input type="text" class="form-control" id="obecPsc" name="obecPsc" required>
                        </div>
                        <div class="form-group mb-3">
                            <label for="email" class="form-label">E-mail</label>
                            <input type="email" class="form-control" id="email" name="email">
                        </div>
                        <div class="form-group mb-3">
                            <label for="telefon" class="form-label">Telefon</label>
                            <input type="text" class="form-control" id="telefon" name="telefon">
                        </div>
                        <div class="form-group mb-3">
                            <label for="web" class="form-label">Web</label>
                            <input type="text" class="form-control" id="web" name="web">
                        </div>

                        <div class="col-12">
                            <button type="submit" class="btn btn-primary float-end">Přidat vizitku <i
                                        class="bi bi-person-plus-fill"
                                        role="img" aria-label="Append"></i>
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </form>
</div>
</body>
