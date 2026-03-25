package com.yagmur.scanner;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScannerEngine {
        // Aynı anda 100 portu tarayacak
        private final ExecutorService executor = Executors.newFixedThreadPool(100);

        public void scan(String ip, int startPort, int endPort) {
            System.out.println("Tarama başlatılıyor: " + ip);

            for (int i = startPort; i <= endPort; i++) {
                final int port = i;
                executor.execute(() -> {
                    try {
                        Socket socket = new Socket();
                        // 200 milisaniye içinde cevap gelmezse kapalı say
                        socket.connect(new InetSocketAddress(ip, port), 200);
                        socket.close();
                        System.out.println(new ScanResult(port, true));
                    } catch (Exception ignored) {
                        // Port kapalıysa hata fırlatır, sessizce geçiyoruz
                    }
                });
            }
            executor.shutdown();
        }
    }

