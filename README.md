# I'm Entity
[![EasySpigotAPI](https://img.shields.io/badge/EasySpigotAPI-%E2%AC%85-4D4.svg)](https://github.com/sya-ri/EasySpigotAPI)

エンティティに変身できるようになる。変身すると特殊効果が付与される。

## 前提プラグイン

- [LibsDisguises](https://www.spigotmc.org/resources/libs-disguises-free.81/)

## 使い方

1. `/d` というコマンドを実行すると、変身できるエンティティ一覧が表示される。
2. 選択すると、そのエンティティに変身でき、特殊効果が付与される。

## Gradle Task

### ktlintFormat
```
gradle ktlintFormat
```

ソースコードを綺麗にすることができます。

### addKtlintFormatGitPreCommitHook
```
gradle addKtlintFormatGitPreCommitHook
```

Git Commit する時に `ktlintFormat` を実行します。やっておくことで必ずフォーマットしてくれるようになるので忘れがちな人にオススメです。

### shadowJar
```
gradle shadowJar
```

Jar ファイルを生成します。`build/libs` フォルダの中に生成されます。