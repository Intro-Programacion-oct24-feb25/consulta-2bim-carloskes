def suma(n):
    if n == 0:
        return 0 
    return n + suma(n - 1) 

if __name__ == "__main__":
    numero = 5
    print(f"La suma de los primeros {numero} números naturales es: {suma(numero)}")
