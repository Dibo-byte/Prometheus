# Prometheus
Embedded Linux Custom Image built for Allwinner H3 processor.

Prometheus é uma plataforma Linux embarcada projetada para aplicações de computação de borda e monitoramento. O sistema é construído utilizando o Yocto Project e tem como alvo o computador de placa única **Orange Pi PC**. Ele integra visão computacional, serviços web, sincronização de rede e interfaces gráficas em uma distribuição Linux personalizada, otimizada para implantação embarcada.

---

## Visão Geral do Sistema

O Prometheus roda no Orange Pi PC, baseado no processador Allwinner H3 ARM Cortex-A7. O sistema operacional é uma imagem Linux personalizada baseada no Yocto, construída utilizando o Board Support Package (BSP) Sunxi para plataformas Allwinner.

O sistema integra múltiplos serviços e camadas de aplicação:

- Aplicações de visão computacional usando **OpenCV**
- Interfaces web construídas com **Node.js**
- Serviços de sincronização de arquivos e compartilhamento em rede
- Sincronização de tempo via **SNTP**
- Interface gráfica rodando em **X11**
- Saída de vídeo via **HDMI** para visualização embarcada

---

## Plataforma de Hardware

| Componente  | Detalhes                                      |
|-------------|-----------------------------------------------|
| Placa       | Orange Pi PC                                  |
| Processador | Allwinner H3 (ARM Cortex-A7 Quad Core)        |
| Memória     | 1GB DDR3                                      |
| Armazenamento | Cartão microSD                              |
| Display     | Tela HDMI de 7 polegadas                      |
| Rede        | Ethernet / Wi-Fi (opcional)                   |

---

## Arquitetura de Software

### Distribuição Linux Embarcada
- Construída utilizando o **Yocto Project**
- Imagem Linux personalizada para o Orange Pi PC
- Integração de BSP baseada na plataforma **Sunxi**
- Seleção otimizada de pacotes para implantação embarcada

### Visão Computacional
As aplicações de visão computacional são implementadas com **OpenCV**, permitindo processamento de imagens em tempo real diretamente no dispositivo embarcado:
- Captura de imagens
- Processamento de frames
- Extração de características
- Detecção de eventos

### Serviços Web
Interface web leve implementada com **Node.js**:
- Monitoramento do sistema
- Gerenciamento de configurações
- Visualização de dados
- Interação remota com aplicações embarcadas

### Serviços de Rede

**Sincronização de Arquivos**
- Sincronização de pastas entre dispositivos
- Transferência automatizada de dados

**Servidor Samba**
- Compartilhamento de arquivos em rede
- Compatibilidade com clientes Windows e Linux

**Sincronização de Tempo**
- Sincronização do relógio do sistema via **SNTP**
- Garante timestamps consistentes para logs e processamento

### Interface Gráfica
O Prometheus inclui uma interface gráfica rodando em **X11**, exibida em uma tela HDMI de 7 polegadas:
- Monitoramento local
- Visualização de dados do sistema
- Interação humano-máquina

---

## Principais Funcionalidades

- Distribuição Linux embarcada personalizada com **Yocto**
- Suporte à plataforma **Orange Pi PC**
- Integração com **Sunxi BSP**
- Visão computacional embarcada com **OpenCV**
- Interface web com **Node.js**
- Interface gráfica local via **X11**
- Suporte a display HDMI
- Compartilhamento de arquivos em rede com **Samba**
- Sincronização de tempo via **SNTP**
- Integração de serviços embarcados para computação de borda

---

## Casos de Uso

- Sistemas de monitoramento industrial
- Câmeras inteligentes
- Dispositivos de visão computacional de borda
- Gateways IoT
- Terminais de interface humano-máquina (IHM)

---

## Habilidades Demonstradas

- Desenvolvimento de Linux embarcado
- Yocto Project e criação de imagens customizadas
- Integração de Board Support Package (BSP)
- Sistemas embarcados baseados em ARM
- Visão computacional com OpenCV
- Serviços web para dispositivos embarcados
- Serviços de rede no Linux
- Sistemas gráficos com X11
