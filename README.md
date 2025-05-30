# Hangman Game - Java Console Application 🎮

Bu proje, klasik **Hangman (Adam Asmaca)** oyununu Java dilinde konsol uygulaması olarak sunar. Oyuncular kelime tahmin etmeye çalışır, skorlarını görür ve yeni kelimeler ekleyebilir.

---

## 🚀 Özellikler

- Kullanıcıdan kelime ekleme (belirli kurallara göre)
- Oyun oynama:
  - Rastgele seçilen kelimeyi harf harf tahmin etme
  - Sınırlı tahmin hakkı
  - Daha önce girilen harfleri kontrol etme
- Skor görüntüleme
- Kullanıcı dostu konsol menüsü

---

## 📋 Kurallar

- Kelimeler en az **4 harf** uzunluğunda olmalı
- **Rakam içermemeli**
- Aynı kelime birden fazla kez eklenemez
- Aynı harf iki kez tahmin edilemez

---

## 🧠 Menü Seçenekleri

Konsol açıldığında aşağıdaki menü sunulur:

- `a`: Yeni kelime(ler) ekle
- `n`: Yeni bir oyun başlat
- `s`: Skorları görüntüle
- `e`: Programdan çık

---

## 💡 Oynanış

1. Önce yeni kelimeler ekleyin (`a`).
2. Ardından bir oyun başlatın (`n`).
3. Her yanlış harf bir hakkınızı götürür.
4. Doğru tüm harfleri bulduğunuzda oyunu kazanırsınız.
5. Her kazandığınız oyun size **10 puan** kazandırır.

---

## 🛠️ Geliştirici Notları

### Kullanılan Java Yapıları:
- `ArrayList` – kelimeleri, tahminleri ve skorları tutmak için
- `Scanner` – kullanıcıdan giriş almak için
- `Random` – rastgele kelime seçimi için

### Önemli Metotlar:
- `DigitControl()` – rakam kontrolü
- `Duplicate()` – tekrar eden kelime kontrolü
- `UserGuess()` – harf tahmini
- `Score()` – skor gösterimi
- `DE()` – daha önce girilen harf kontrolü

---


## 📦 Çalıştırma

Bu bir **Java konsol uygulamasıdır**. Çalıştırmak için:

1. `javac HangmanGame.java` komutuyla derleyin.
2. `java HangmanGame` komutuyla çalıştırın.

---

## 🧑‍💻 Yazar

**Betül Bilhan**

GitHub: [@betulbilhan](https://github.com/betulbilhan)

---


