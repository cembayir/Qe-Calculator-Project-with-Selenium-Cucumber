# Hesap Makinesi Modülü Test Otomasyonu

Bu proje, Cucumber ve Selenium araçları kullanılarak oluşturulmuş bir web test otomasyon projesidir. **ABC Teknoloji** şirketinin finans uygulamasına eklenen hesap makinesi modülünün testlerini kapsamaktadır. Proje, modülün kritik işlevlerinin doğru çalıştığını ve kullanıcı dostu olduğunu doğrulamayı amaçlar.

---

## Proje İçeriği

- **Test Edilen Özellikler**:
  - Yatırım Hesaplaması
  - Aylık Bütçe Hesaplaması
  - Kredi Karşılaştırması
  - Kısa Vadeli Yatırım Hesaplaması
  - Günlük Gider Takibi
  - Yıllık Yatırım Hesaplaması
  - Döviz Dönüşümü

- **Kullanılan Teknolojiler**:
  - **Selenium 4**: Web otomasyonu
  - **Cucumber Framework**: BDD tabanlı testler
  - **Java**: Kodlama dili
  - **Maven**: Proje bağımlılık yönetimi
  - **Allure Report**: Test raporlama

---

## Test Koşum Raporlarına Erişim

1. **Cucumber HTML Raporu**:
   - Proje Cucumber ile yazıldığı için test koşumundan sonra **"Run" ekranının alt kısmında bulunan "View your Cucumber Report at:"** başlığı altında mevcut test koşumunun HTML raporuna ulaşabilirsiniz.

2. **Allure Raporu**:
   - Projede Allure Report eklentisi bulunmaktadır. Test koşumunun `.json` formatındaki sonuçları ve `.png` formatındaki ekran görüntüleri proje dizininde bulunan `allure-results` klasöründe yer almaktadır.
   - Test koşumundan sonra Allure Report tarafından üretilen raporlara erişmek için kullanılan IDE'nin "Terminal" ekranına aşağıdaki komut yazılabilir:
     ```bash
     allure serve allure-results
     ```

---

## Test Koşumu Nasıl Yapılır?

 **Runner Class ile Test Koşumu**:
   - Projede test koşumları `.feature` uzantılı dosyalardan yapılabileceği gibi `Runner` class kullanılarak da yapılabilir.
   - Her senaryo grubuna, projede temsil ettiği konu ile ilgili `@tag`'ler verilmiştir (örn: `@yatirimhesaplama`, `@gunlukgiderhesaplama`).
   - Runner class içerisinde koşmak istediğiniz test gruplarının taglerini `or` ile ayırarak yazdıktan sonra test koşumunu gerçekleştirebilirsiniz.

---

## Kurulum Talimatları

### Gereksinimler

- **Java JDK** (8 veya üzeri)
- **Maven** (Son sürüm)
- **Bir IDE** (Örneğin IntelliJ IDEA veya Eclipse)
- **Web Tarayıcısı** (Chrome, Firefox veya Safari)

---

### Adım 1: Projeyi Klonlayın
Projeyi yerel bilgisayarınıza klonlamak için aşağıdaki komutu kullanabilirsiniz:
```bash
git clone https://github.com/kullanici/proje-adi.git
```

### Adım 2: Bağımlılıkları Yükleyin
Projede kullanılan bağımlılıkları yüklemek için aşağıdaki komutu çalıştırın:
```bash
mvn clean install
```

### Adım 3: Testlerin Çalıştırın
Tüm test senaryolarını çalıştırmak için:
```bash
mvn test
```
Belirli etiketlere (@tag) sahip test senaryolarını çalıştırmak için:
```bash
mvn test -Dcucumber.filter.tags="@aylikbutcehesaplama"
```

### Adım 4: Raporları İnceleyin
Proje çıktılarının Allure raporlarını incelemek için aşağıdaki adımları izleyin:
Allure raporlarını çalıştırmak için:
```bash
allure serve target/allure-results
```

Allure kurulu değilse, yüklemek için:
```bash
npm install -g allure-commandline
```




