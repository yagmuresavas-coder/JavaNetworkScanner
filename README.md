Java Port Scanner

Bu proje, Java kullanılarak geliştirilmiş basit bir port tarama (port scanning) uygulamasıdır. Belirtilen bir IP adresi veya domain üzerinde açık portları tespit etmek için kullanılır.

Özellikler
Belirli bir IP adresi veya domain üzerinde tarama yapabilme
Belirli port aralığını tarayabilme
Açık portları listeleme
Hızlı ve basit kullanım
IntelliJ IDEA ile geliştirilmiştir
🛠️ Kullanılan Teknolojiler
Java
Socket Programming (java.net.Socket)
IntelliJ IDEA
📦 Kurulum
Bu repoyu klonlayın:
git clone https://github.com/kullaniciadi/port-scanner.git
IntelliJ IDEA ile projeyi açın
Projeyi çalıştırın
▶️ Kullanım

Program çalıştırıldığında sizden aşağıdaki bilgileri ister:

Hedef IP adresi veya domain
Başlangıç portu
Bitiş portu

Örnek:

IP: 127.0.0.1
Başlangıç Portu: 20
Bitiş Portu: 100

Program açık olan portları terminalde listeler:

Port 22 açık
Port 80 açık
Nasıl Çalışır?

Program, belirtilen port aralığında her bir porta bağlanmayı dener.
Eğer bağlantı kurulabilirse, o port açık (open) olarak kabul edilir.

⚠️ Uyarı

Bu araç yalnızca eğitim ve etik kullanım amacıyla geliştirilmiştir.
İzinsiz sistemler üzerinde tarama yapmak yasal sorunlara yol açabilir.

📌 Geliştirme Fikirleri
Çoklu thread (multi-threading) desteği ekleme
GUI (JavaFX / Swing) arayüzü geliştirme
Servis tespiti (port üzerinden çalışan servisleri belirleme)
Timeout ayarlarını optimize etme
