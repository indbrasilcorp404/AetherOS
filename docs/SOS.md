# 🆘 SOS - Guia de Comandos AetherOS

Este guia descreve os comandos disponíveis no **AetherOS v0.0.1**.

## 💻 Comandos de Sistema
* `help` : Exibe esta lista de ajuda.
* `version` : Mostra a versão atual do Kernel e do sistema.
* `exit` : Encerra a sessão do terminal e desliga o Kernel de forma segura.

## 📂 Gestão de Ficheiros (EXT5)
* `ls` : Lista todos os ficheiros e diretórios presentes na raiz do sistema.
* `cat [nome_do_arquivo]` : Lê e exibe o conteúdo de um ficheiro específico.
    * Exemplo: `cat system.cfg`
* `format` : (Em desenvolvimento) Limpa a tabela de Inodes do sistema de arquivos.

## 🛠️ Resolução de Problemas (Troubleshooting)

### + O que fazer se:
* **O comando não for reconhecido:** Verifique se digitou corretamente ou use `help`.
* **O ficheiro não abrir:** Certifique-se de que o nome está exatamente igual ao listado no `ls` (Diferencia maiúsculas de minúsculas).
* **O Kernel não iniciar:** Verifique se a sua versão do JDK é a 21 ou superior.

### - O que evitar:
* **Não force o encerramento:** Use sempre o comando `exit` para garantir que o Journaling do EXT5 feche os logs corretamente.
* **Caracteres especiais:** Evite nomes de ficheiros com espaços ou símbolos complexos nesta versão Alpha.

---
*AetherOS - Open Source Project sob Licença MIT*
