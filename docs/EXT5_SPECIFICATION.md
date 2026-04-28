Especificação Técnica: EXT5 (Experimental File System)
​O EXT5 é um sistema de ficheiros virtual desenvolvido para o AetherOS, focado em simplicidade e integridade de dados através de Journaling.
​1. Arquitetura de Inodes
​Ao contrário de sistemas tradicionais que usam tabelas fixas, o EXT5 utiliza Inodes Dinâmicos. Cada ficheiro no sistema é representado por um objeto Inode que contém:
​Inode ID: Identificador único numérico (UID).
​Nome do Ficheiro: String de comprimento variável.
​Size: Tamanho do ficheiro em bytes.
​Timestamp: Data de criação e última modificação (Unix Epoch).
​Data Block: Array de bytes que armazena o conteúdo real.
​2. Mecanismo de Journaling
​Para evitar a corrupção de dados em caso de encerramento inesperado, o EXT5 implementa um Circular Journal.
Antes de qualquer alteração no sistema de ficheiros (criação ou eliminação), a operação é registada num log persistente.
​Fluxo de Escrita:
​LOG_START: A operação é registada no Journal.
​EXECUTE: O Inode é criado ou modificado na memória.
​LOG_COMMIT: O Journal confirma que a operação foi concluída com sucesso.
​3. Hierarquia e Diretórios
​Na versão v0.0.1, o EXT5 utiliza uma estrutura Flat NameSpace (espaço de nomes plano), onde todos os ficheiros residem na raiz simulada. Futuras versões incluirão suporte para Inodes de diretório (Inodes que apontam para listas de outros Inodes).
​4. Limitações Experimentais
​Volatilidade: Atualmente, os dados são mantidos na RAM através da JVM.
​Mapeamento: O próximo passo do desenvolvimento é o mapeamento de blocos de bytes para ficheiros .img binários.
