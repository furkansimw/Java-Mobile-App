lateinit var saveData : SharedPreferences  //global var lateinit zaten init bekliyor	

saveData = this.getSharedPreferences("com.furkan.savedata", Context.MODE_PRIVATE) // on create alti

var gelenVeri = saveData.getString("data", "DEGER YOK!") // veri okuma degeryok => default value

saveData.edit().putString("data", edit.text.toString()).apply() //veri yazma
