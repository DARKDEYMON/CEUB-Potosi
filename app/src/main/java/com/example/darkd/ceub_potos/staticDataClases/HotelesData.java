package com.example.darkd.ceub_potos.staticDataClases;

import com.example.darkd.ceub_potos.clases.Hoteles;
import com.example.darkd.ceub_potos.clases.Restaurantes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class HotelesData {
    private static ArrayList<Hoteles> hoteles = new ArrayList<Hoteles>();
    private static boolean llenadoho = true;

    public static ArrayList<Hoteles> getHotelesData(){

        if(llenadoho) {
            hoteles.add(new Hoteles(
                    "HOTEL COLOSO",
                    5,
                    "Calle Bolívar N° 965",
                    "(591-2) 62-22627",
                    null,
                    "info@p otosihotel.com",
                    -19.587680f,
                    -65.751425f,
                    "https://lh3.googleusercontent.com/qBBo7K3vV97KSoH29WvmnjmnWgyaIAfs7VzpXIb3Wz6SRgMMYxY2xfdVFQjMAMa3lM7_uz1xuFqM5Ulnd3rjSbvK-GLxngIAJ8z4H3eI1VuNC8zKOahy0_mHgTJ35zSB68hd5N0jHg=w2400"));
            hoteles.add(new Hoteles("VALERY HOTEL",4,"Av. Litoral esq. Colquechaca N° 483","(591)-2-6223288",null,"info@valeryhotel.com ",-19.579686f,-65.755610f,"https://lh3.googleusercontent.com/c59-KSzO6SlK5FxdpCq8ODiEnbb6pWkEYxTkQ5hlIk6I1mLkSFmGd6Yv6-3v2qgXDP7kZ2DzBia5pEq1OHgq2x2IRi1MlnFn-qG0sGkZq2umHAw1vaRKfVTlJjLJuhhsC5tnQrViQA=w2400"));
            hoteles.add(new Hoteles("NICOLE HOTEL",3,"Av. Las Lecherías (Zona Nueva Terminal donde salen y entran los buses) ","(591-2) 62-48103",null,"reservas@nicolehotel.com ",-19.587702f,-65.751406f,"https://lh3.googleusercontent.com/5J6L1LqcMRyUXZKYEX0oDptfw5RZ_I8aG3QKOvxOiYoDCvdZC8YRt-6p20HRi6y8Hzk1d7Ii-4WusAv3gQsoOXuZH4PbWomlm8_2Ii3cUpK1RwDHA0f_O_3TZJd_24wYyUxabPFoNw=w2400"));
            hoteles.add(new Hoteles("CLAUDIA HOTEL",3,"Av. El Maestro N° 322 ","(591)-2-6222242  ",null,"claudiahotel@yahoo.com",-19.583157f,-65.757562f,"https://lh3.googleusercontent.com/FRdp9g5gfJCdqTtw1yUeEqsx1s7JiwWTCi2IOFAt9i9InpZw4E7WL4MmtofYnz6KAX65Rt87tvf3dJjwmrziL4ijIudZeHrax1w1yOmR7LbadhCLyvLnZUJCnKsCupKnZ6l09xHsZA=w2400"));
            hoteles.add(new Hoteles("HOTEL CIMA ARGENTIUM",3,"Av. Villazon N° 239","(591-2) 622-9538 ",null,"info@hca-potosi.com",-19.583126f,-65.757555f,"https://lh3.googleusercontent.com/oi1pIEiW9A18TEQioR_PXHqXNd13FsRUuaneKiaG1j66EwuunYXNSd_6TXIbZaWPG_YfFPs2FL1aVtAsueTeYJKs3YyP-9AJgbdYGDogHpmmSzYtZcBKA5hINuB1o3YDBgdWnquvSA=w2400"));
            hoteles.add(new Hoteles("HOTEL SANTA TERESA ",3,"Calle Ayacucho N° 43","(591) (2)6225270",null,"informaciones@hst-potosi.com",-19.581736f,-65.757701f,"https://lh3.googleusercontent.com/5fn5eoTjm3pefDpih7PHVfBd_3ZSDRbTtDf0YmmXd5uVl1tXWweGg22WaNwAegdTXDIiQvwntyh9sZDMsdolBGE1VhBRmk5ky-HrJbk2WgypFzA_JZKDuzSs7nnzOfPOVaQDjg-Qgw=w2400"));
            hoteles.add(new Hoteles("HOTEL GRAN LIBERTADOR",3,"Calle Millares N° 58 ","(591)2-6227877 ",null,"libertador@entelnet.bo ",-19.589158f,-65.756404f,"https://lh3.googleusercontent.com/YtL2A74y-ZPVnOMwFrbgAVbLEaraNGPzBYpb2Db7U_cWrbk156e5pj3NPKlqMFS_YgCSJvwirxj8Mupv4yymm8WBaeTKGggeY8uY5ODb3mRnAvvUZErfC8dpZj7QtDhW4SgwiV83kw=w2400"));
            hoteles.add(new Hoteles("LUPERIA HOTEL  ",1,"Av. Serrudo N° 167 ","591-2- 6223756 ",null,"Luperiahotel@hotmail.com ",-19.583408f,-65.756184f,"https://lh3.googleusercontent.com/rsj6-lmeoLv0mzKiqsus0h8acH04JeLMIGIOp-qdTK-zjWTtxDLAvQJEkJUBQjs7JM2l0Zmh_tiOKkXs8tdol5iAvxPSn98JKds_e6kYLq3mFQNjsX9w-mnjd8IJmLc25yYTxuQdlA=w2400"));
            hoteles.add(new Hoteles("HOTEL JERUSALEM  ",1,"Calle Oruro N° 143 ","6224633.0",null,"hoteljer@entelnet.bo ",-19.585271f,-65.756220f,"https://lh3.googleusercontent.com/IP5K4DxwW5oe8x5IXjzajXOoh90LHIgoo0Pm3vAkozo1t3979LBMu_O1VIwPH8tV7-hVdHoHWBSU9mlHbe6xsD3tcz0Bo878k75o1doA-6gPZAGDXInlaxW5xMYhLCjYWgfZ27oJwg=w2400"));
            hoteles.add(new Hoteles("HOTEL SAN ANTONIO",1,"Calle Oruro N° 136 ","6223566.0",null,"hotel_sanaantonio@hotmail.com ",-19.585599f,-65.756137f,"https://lh3.googleusercontent.com/o8T6npK1JeQGn0T32CXrTL13Desl8vKzAYudDec5ctkEAYCTE2tveoB7AhfWujqq_TPiN_YkF0RTdPg9JmGSi199aJ4CKfFfoYrMuP5exSZgX5LUWNxvx9rIMJzBiXuy-8hAfHaS6Q=w2400"));
            hoteles.add(new Hoteles("HOSTAL COLONIAL",4,"Calle Hoyos N° 8","(591)-2-6224265",null,"hcolonial_potosi@hostalcolonialpotosi.com ",-19.589102f,-65.752146f,"https://lh3.googleusercontent.com/xIeo6JubcosN0dL0ADtzf9y6u7YQra012EyZMypUkal4lAis3K0oZhczK_jX008hguqMQ5wxJMOrOYpVZ98s39PGSVAP9-tMlsyoR6dPg1mk3ml65lu242W7eDxYh5IMYmcpX2fjLw=w2400"));
            hoteles.add(new Hoteles("HOSTAL PATRIMONIO",4,"Calle Matos N° 62 ","(2) 6222659",null,"hp.potosi@gmail.com ",-19.588171f,-65.752106f,"https://lh3.googleusercontent.com/COEFpZWtDhWUSFVnbTcWjVZEFwBJnDB191r-_3Aq2rLoliUlW3Wjrdt8bNIfrzmown0uSSU4Vc_Ov_FdslliLNVsj9T7SB53heUv_3p-rkE8cnUbQm54yx6nG1QJUiHriwkieJCB5Q=w2400"));
            hoteles.add(new Hoteles("HOSTAL TUKOS LA CASA REAL ",3,"Calle Hoyos N° 29 ","62-30689",null,"hostaltukos@hotmail.com ",-19.588664f,-65.750310f,"https://lh3.googleusercontent.com/CJm888qUqPBhCMcxvvu5TXYkX9NYDYCyfrIXuPT6HnM2xu_UMLTtKwNGkGx8M_ZLzMvh_zTsPdbetmw3q6imy1Ow77aRdcOeIm_GVGJ28IEdKxkIOrC4Bq1bLVy52W5UX2ojUTxSMQ=w2400"));
            hoteles.add(new Hoteles("HOSTAL FELIMAR",2,"Calle Junín N° 14 esquina Bolívar ","6224357.0",null,"No Cuenta",-19.587141f,-65.753370f,"https://lh3.googleusercontent.com/FAB7-ihS22YnKYndKRPVPpQw6sMHUVX4mJvJzx2a5RcsPHxTQmDmq9AjiJnZJ5NCkF4WNeLomrvm8Nm0Ydb_VuQsyIUzDNQ8wni89a06xF--BD6BE8Vb22b1nB7jJbr8pI1WtJLS9A=w2400"));
            hoteles.add(new Hoteles("HOSTAL COMPAÑÍA DE JESUS ",2,"Calle Chuquisaca N° 443","(+591)2 6223173 ",null,"No Cuenta",-19.590077f,-65.752899f,"https://lh3.googleusercontent.com/djn5JeT1Z6ExvptFewgKM4NobgUHPaOYt9Sbwj7ahSwKeVR_wiOJRhTJcaX_BDh7Y5jSSX6FqPGMADrI6iK89rbHP1VXDpDDXAfRS6Fhgfuf5648wnmyjEQjPSY6np-aSimSG7XG0A=w2400"));
            hoteles.add(new Hoteles("HOSTAL SAN JOSE ",2,"Calle Oruro N° 171 ","(591) (2)622-4394 ",null,"No Cuenta",-19.585384f,-65.756157f,"https://lh3.googleusercontent.com/hW6Pi8Do3QgbMfQVAtGo2tNAxCsvOf-kFDRUyvagqFad_9U1KLTmZnSjDqwvD41x_-4VpUvwcKSxqYUtsASTqhzjKYTZUOO2EQPJZhkhKoBKUDJmWKwADJ17wXOOgDWYmfGrIT7WRQ=w2400"));
            hoteles.add(new Hoteles("HOSTAL CARLOS V IMPERIAL ",2,"Calle Linares N° 42 ","62-31010 ",null,"frontdesk@hostalcarlosv.com ",-19.589584f,-65.752209f,"https://lh3.googleusercontent.com/peVd-Y4PPi1YcR1NNEh1tRf0smWJpnNSA1XL5STqfpE3ih0JVnFESrBQaVN0bRnPJnXtCgxeay_il7WX3K8V2Y5j6wkkZev_-6nqesaBzsBMOoMK11y7J-nb88qK-m3nyN6QkixfDg=w2400"));
            hoteles.add(new Hoteles("HOSTAL FELCAR ",2,"Av. Serrudo esquina Bustillos N° 345 ","62-24966",null,"No Cuenta",-19.584938f,-65.754219f,"https://lh3.googleusercontent.com/OD3JICcn4JzQsKrPFHesDZzV8nKJeE1f9deBGTvn8rGqvktTNbbKTb9fqqk7gGtkJZTkWKObfnFV0bg_veU0nj4z14ke4GrxKOBiFirHniqC3nGdUJavGmQjN3bjvgBJR2iEi7u27w=w2400"));
            hoteles.add(new Hoteles("HOSTAL SAN MARCOS ",2,"Calle La Paz N° 1626 ","26230010.0",null,"turismoclaudiabolivia@gmail.com ",-19.592679f,-65.750699f,"https://lh3.googleusercontent.com/27UgZwcaLvEFGneLbBety7kvZ59AzBAYplNiqUZ8hE2q0J__dZnv7Gq2D9Ar5YUWeah22FkhxK5ysvTjE3V-LxSbQYaJYnB8ad-1mxxx8e7nZ2cMaCB3GNkfkpagdWBMcK0Y87XHiQ=w2400"));
            hoteles.add(new Hoteles("HOSTAL LA CASONA ",2,"Calle Chuquisaca N° 460 ","591-2- 6230523 ",null,"casona@hotelpotosi.com ",-19.590274f,-65.752767f,"https://lh3.googleusercontent.com/XcN55sV8x6TMlN_1oIfureqpsx19_jAPjKDXHdv_kzfSt9KPbxfcDy7fTsf5NW53CmxH8JI6kvAR71sBQoy2-jbSsPvnPMQlYg-StBqjR6J1EyBH01xhCQ0FofNM5NSzBDYNI-lbjQ=w2400"));
            hoteles.add(new Hoteles("HOSTAL L´ CIEL DE EUCALIPTUS ",1,"Calle Linares N° 88 A ","(591-2) 6223787 ",null,"No Cuenta",-19.589524f,-65.750490f,"https://lh3.googleusercontent.com/9yEa_AD1vCC4CzSXUF69cmsH42L6j531Rm6nAqmVqYnMu8v_EeHGupRstKHDHL8OOiIxAJq6HOEqsFF555dWVVN8mGKp4JnihnukgjNxmmD-Ab_jf3eTmplASKslCSkg5jHkXjHCPw=w2400"));
            hoteles.add(new Hoteles("HOSTAL LA REALEZA ",1,"Calle Ayacucho N° 15 "," (+591) 2-6223802 ",null,"larealeza_hostal@hotmail.com ",-19.588989f,-65.754276f,"https://lh3.googleusercontent.com/YMj_GI18kv1WdV9lB1_VDBYBUi1Jbst3_Rl_OjNuEwykXGtc3f5NURVBgpwqCScx2fVfoD6px8ELHKjbg4kVPb0R1lqbFMx_pKhR_JII1N7uIHTxongYmgjnjBuvnOv6STvDLZsJZQ=w2400"));
            hoteles.add(new Hoteles("RESIDENCIAL SUMAJ",1,"Calle Fortunato Gumiel N° 12 ","(591) 6223336",null,"hoteljer@hotmail.com ",-19.584336f,-65.755367f,"https://lh3.googleusercontent.com/7lmZc7-7paSFhgnHB3YXaAq4Nt6UPBobk5aHNjbOBUEad_gm6VQFTZgWKhNlZPWD4SbrzLYyoKI4TpcRmiEeV17k5JuV2P4U_8ab_gk6gRs3bGjBQ2qaZQiDUaTmlcu1iyv1LUhyrw=w2400"));
            hoteles.add(new Hoteles("RESIDENCIAL TARIJA ",1,"Av. Serrudo N° 252 ","(591) 6222711",null,"No Cuenta",-19.584375f,-65.755402f,"https://lh3.googleusercontent.com/_qMfMvP8-ERZ_m9XlP8tohOVjhCza7gQuq1SpNJDB22DDD615X2nUR83j9taSeVTcMU_wRLFSwISoQHV8Z7xKlV0zgqknOOMOhCLCpSHY1lA5syq-AY0bBQwC_NxOxo6Wkhu9TIC7g=w2400"));
            hoteles.add(new Hoteles("ALOJAMIENTO LA PLATA INN “A”",1,"Av. Universitaria N°66 (frente a la ex terminal de buses)","(591) 6244114",null,"No Cuenta",-19.578739f,-65.765061f,"https://lh3.googleusercontent.com/sZhzxTyq1maJNpCe_UMp-0tnmUiuLU1BQJsi7K16PTE4Ybr4TbOPXbCofI-B-11bSaYgoVsxKk1LBxwe72p5GN_fHlFlb3Z9OsOV-NovzaYyalrzs1lS2vm133zcNokWG8U5mx59Dw=w2400"));
            hoteles.add(new Hoteles("ALOJAMIENTO SANTA ROSA “A” ",1,"Av. Universitaria  (frente a la ex terminal) ","No Cuenta",null,"No Cuenta",-19.578151f,-65.765566f,"https://lh3.googleusercontent.com/k-dPr-iXI4SDKd6lZj9nvkUxwr4D6QcNZbyNQynVnIr2xeGnAio3elEDCf9gyxmaNbF-kvVYsE2pJWuoY-6XJRztTo-L5VYsAyWuaYh6onDYtUf5Km6PQhPc56Sh4lORtXSwNAqXwg=w2400"));
            hoteles.add(new Hoteles("ALOJAMIENTO LAS BANDERAS “A” ",1,"Av. Las Banderas (zona nueva terminal) ","(591) 6245886 ",null,"No Cuenta",-19.556889f,-65.762498f,"https://lh3.googleusercontent.com/mMEd3dn_l5ehdbThFrbVduF0qiOkMGQirYIULnOQQgHLXFGtAPdftgOnDZ6-RFnSu49HvC-U0f-8E7MB9kv4PUNr-wxkz3fVOVlzIY3e91zSvrc87eeu0r-avV4EdfYukUvnIB6RLQ=w2400"));
            hoteles.add(new Hoteles("ALOJAMIENTO ORURO “B” ",1,"Calle Oruro N° 292 ","(591) 62 22637",null,"No Cuenta",-19.586168f,-65.755524f,"https://lh3.googleusercontent.com/SkVI-Ab_dVbiyuOC5nZzF3XFbv0uhITmoh5M4SiCwaNJVzigm_ZO8JDkYDlLEY1ADvHnXq6Q6Bo6hHz8iovxq3YA75qnNiRZks9sT9m0MAlcLVkecW46ukGeNJi26r6TgNNnmMPuFg=w2400"));
            hoteles.add(new Hoteles("ALOJAMIENTO LA MONEDA “B” ",1,"Calle Otero esquina Sanjinés ","(591) 6246311  ",null,"No Cuenta",-19.577564f,-65.765370f,"https://lh3.googleusercontent.com/AT-8kYjIzQ-8Sh507P-mH1gG7NP-qjXmVn_lRlkwcTpe4haJA9TAiU30cymvt2znfnG1OVQ9mv0lFKNso5x7sWVkXXcv0IhYNuyc5w7zhHz1cUpt282y-95Yh8BiaprW8hC3uco0jg=w2400"));
            hoteles.add(new Hoteles("ANDES SALT EXPEDITIONS TOUR OPERATOR",1,"Plaza Alonso de Ibáñez N° 3 ","(591) 622-5175",null,"turismo_potosi@hotmail.com",-19.590139f,-65.752917f,"https://lh3.googleusercontent.com/lGUqxxIfL9shljg8Ih0lWaVbvIhsyrxd5_StDTCVUbMlExZNs3GKnXK3HsHZQ3Y7mqRD7QARsFzw_iDhV3qGLHijwzTOXaJe_ERNT3-hTYZSPiRYpugrYbHuXVKS1bHyqK0K4tunSw=w2400"));
            hoteles.add(new Hoteles("BIG DEAL TOURS ",1,"Calle Bustillos N° 1092 esquina Ayacucho","62-30478",null,"bigdealtours@gmail.com ",-19.588809f,-65.754614f,"https://lh3.googleusercontent.com/6Rb95Mt_R2l0aFDR5qxlbyWXLXguMmg8tWHwXtGsK6qqxPlyXep9YINeiI-IOnz2nW5-D8bG3ABntQNjaS4zGyGhQy4sGKpXAYtAor0R6gaqponQ0hVEd3hD0mcZ4ZosKNILHQULYA=w2400"));
            hoteles.add(new Hoteles("HIDALGO TOURS ",1,"Calle La Paz N° 1133 esquina Matos ","(591  -2) 6229512",null,"info@salardeuyuni.net ",-19.588305f,-65.750856f,"https://lh3.googleusercontent.com/rDMIlGLzvptaSZT3lgNmBtepM20FUZN4fEyr5CR7VT8CSi3w0hACksNrS5V-_tBUTDJ67XcJP_x-QqDMsmuRmfgRSUG6CloX_zSe0EcM1sw1zGbwgExzRVQrMLMkAQHee7-Rp5lPVA=w2400"));
            hoteles.add(new Hoteles("KOALA TOURS ",1,"Calle Ayacucho N° 5 frente a la Casa de Moneda ","(591) 6226467  ",null,"koalabolivia@hotmail.com ",-19.589017f,-65.754200f,"https://lh3.googleusercontent.com/WLLVpRgwAGUvrAFx77CL3BaW5jcxf_Fou7JHdOrv1k9XqPQXjT5GXzFTJqRIvVxW1_JbcewbbWC4ip-ABjSRzlFNQkx1h3XOSi2sObsyq7ZuAblDwXa6t-LkwA-QDPUaMya_pKJFrQ=w2400"));
            hoteles.add(new Hoteles("MARCO POLO TOURS ",1,"Calle Bustillos ","No Cuenta",null,"marcolopoloagency@hotmail.com",-19.587922f,-65.754591f,"https://lh3.googleusercontent.com/o2qRRVaWPlQSPSlhZafuZNsQZN9zwlBEfsZ6L8uYZtjOJ3E7r9t3PNcfE22VROaQMVoMNfxZUjPT2UrW5vrHk_E3rVv80x05IRv374thhm6UjmhPrnhIObBHYO5JY8folJAvoTwjNw=w2400"));
            hoteles.add(new Hoteles("A.M. TRAVEL ",1,"Calle Ayacucho N° 9 ","(591-2) 6230060 ",null,"a.m.travel@hotmail.com",-19.588963f,-65.754199f,"https://lh3.googleusercontent.com/EVYpOAinvwxd-Js4COFOCFSy2uDP8NWSbX-pnsLWcH1d_H56niYX_Ap76G9m4tLS4-caG_o1QJ1KCRcP7OAs13H8_E8DkqDJtHcLdW7qHF7cKFFBmpkP5Zg--y2gj3Lr1olPeH03Vg=w2400"));
            hoteles.add(new Hoteles("GREENGO TOURS ",1,"Calle Junín N° 15 – 17 ","(2) 6231362 ",null,"greengotours@hotmail.com ",-19.586873f,-65.753019f,"https://lh3.googleusercontent.com/3WNb6zdHwezIl2vF4nvKW6swhh2BKofQjEBTFEWz9XbL-67qGGsTepqRLhggKmyPqpsGxDW-Ciw2ZjUPozPFafr2sEgNEMFzL0rD_saLpxt6-OZ9goSdELsi_GdnhbJuxkR5G8hvuQ=w2400"));
            hoteles.add(new Hoteles("AMIGOS DE BOLIVIA ",1,"Calle Ayacucho N° 20 ","(591) 62-26462",null,"amigosdeboliviapt@hotmail.com ",-19.589144f,-65.754912f,"https://lh3.googleusercontent.com/4Hd3d7RP-scEZ6JnMg0wDE6OtiivCJFvCrHC8gVeqAV3uJgdWcRSr2qhrxQWD7g9t7A4tpsV3LxWxF4j1bMpBvchfYRhPr_cCN40HoFGGGYo75Ay7mToYV0myEbeW6RxSRsCeuFVow=w2400"));
            hoteles.add(new Hoteles("ALTIPLANO S.R.L. ",1,"Calle Ayacucho N° 19 ","6225353.0",null,"turismo-altiplano@hotmail.com ",-19.588968f,-65.754573f,"https://lh3.googleusercontent.com/qKl6jRNrL0ocIgi_5ml4n-BUuzEhDBbTaqlYMoE1lFDA3HamEve6KxUV3_xAeP0hsxRK8WpF4tnZGFBT1NwkQfQS23ZeAAH_4tnIVsIIUdDXisDZcWn242OhdSvJlkAD2LXO5aXKCg=w2400"));

            llenadoho=false;
        }
        return hoteles;
    }
}
