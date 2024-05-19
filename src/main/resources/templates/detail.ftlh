[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>
<div class="detail">
    <div class="vizitka">
        <div class="jmeno">${vizitky.jmeno}</div>
        <div class="firma">${vizitky.firma}</div>
        <div class="udaje">
            <div class="adresa">
                <div>${vizitky.ulice}</div>
                <div>${vizitky.obecPsc}</div>
            </div>
            <div class="kontakty">
                [#if vizitky.email??]
                    <div><i class="las la-at"></i> <span>${vizitky.email}</span></div>
                [/#if]
                [#if vizitky.telefon??]
                    <div><i class="las la-phone-alt"></i> <span>${vizitky.telefon}</span></div>
                [/#if]
                [#if vizitky.web??]
                    <div><i class="las la-globe"></i> <span>${vizitky.web}</span></div>
                [/#if]
            </div>
        </div>
    </div>

    <form method="post" action="/delete-card" class="d-inline">
        <input type="hidden" name="id" value="${id}"/>
        <button type="submit" class="btn btn-secondary">Smazat vizitku</button>
    </form>

    <div class="mapa">
        <iframe style="border:none" src="https://frame.mapy.cz/?q=${vizitky.celaAdresa?url("UTF-8")}" width="100%" height="100%"
                frameborder="0"></iframe>
    </div>

</div>
</body>
</html>
