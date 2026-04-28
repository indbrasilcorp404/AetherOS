# 🤝 Contribuindo para o AetherOS

Ficamos muito felizes por estares interessado em ajudar a desenvolver o **AetherOS**! Este é um projeto focado em performance (GUI Puro) e no inovador sistema de ficheiros **EXT5**.

## 📜 Regras de Conduta
1. Seja respeitoso com todos os colaboradores.
2. Mantenha o código limpo e comentado.
3. Use a nomenclatura oficial: **Aether** para componentes centrais.

## 🛠️ Como contribuir com Drivers
Se deseja criar um novo driver (ex: Rede, Som, Teclado), siga o padrão da interface `AetherDriver`:

1. Implemente a interface `src.drivers.AetherDriver`.
2. Garanta que o método `initialize()` não bloqueie o Kernel.
3. Se for um driver gráfico, utilize o pipeline do **AetherGL**.

## 📂 Padrão de Commits
Para manter o histórico organizado, utilize prefixos nos seus commits:
* `feat:` para novas funcionalidades (ex: `feat: adicionado suporte a Inodes no EXT5`)
* `fix:` para correção de bugs (ex: `fix: erro de renderização no AetherGL`)
* `docs:` para alterações na documentação (ex: `docs: atualizado SOS.md`)

## 🚀 Processo de Pull Request
1. Faça um **Fork** do projeto.
2. Crie uma branch para a sua alteração (`git checkout -b feature/nome-da-feature`).
3. Envie as alterações (`git push origin feature/nome-da-feature`).
4. Abra um **Pull Request** detalhando o que foi alterado.

---
AetherOS - Construindo o futuro dos sistemas operacionais em Java.
