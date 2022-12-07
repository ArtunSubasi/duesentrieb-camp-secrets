# Mozilla SOPS: Secrets OPerationS

https://github.com/mozilla/sops

Sops is an editor of encrypted files that supports YAML, JSON, ENV, INI and BINARY formats and encrypts with AWS KMS, GCP KMS, Azure Key Vault, age, and PGP.

## Requirements for the demo
- Install SOPS
- Get an AWS account and configure AWS CLI

## Demo
- Try using sops with the command `sops -i test.yaml`
Why does not it work?
- Create an AWS KMS key
- Copy the .sops.template.yaml as .sops.yaml and modify to use the AWS KMS key
- Try the `sops -i test.yaml` command again
- Check the file content with a plain editor such as `less` or `vim`
- What elements are encrypted?
- Open it again with `sops`

