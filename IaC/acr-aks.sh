RESOURCE_GROUP="foodforlife-rg"
AKS_CLUSTER_NAME="foodforlife-aks"
ACR_NAME="foodforlifeacr"

#Create RG
az group create --name $RESOURCE_GROUP --location eastus

#Create AKS Cluster
az aks create --resource-group $RESOURCE_GROUP --name $AKS_CLUSTER_NAME --node-count 1 --enable-addons monitoring --generate-ssh-keys

# Run the following line to create an Azure Container Registry if you do not already have one
az acr create -n $ACR_NAME -g $RESOURCE_GROUP --sku basic

# Connect aks with acr
#az role assignment create --assignee $CLIENT_ID --role acrpull --scope $ACR_ID

az aks update -n $AKS_CLUSTER_NAME -g $RESOURCE_GROUP --attach-acr $ACR_NAME

